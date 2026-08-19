console.log("Expense Tracker Started");


// LOAD ALL EXPENSES

function loadExpenses() {

    fetch("/api/expenses")

        .then(response => {

            if (!response.ok) {
                throw new Error("Failed to load expenses");
            }

            return response.json();

        })

        .then(data => {

            displayExpenses(data);

            updateDashboard(data);

        })

        .catch(error => {

            console.error("Error loading expenses:", error);

        });
}


// DISPLAY EXPENSES


function displayExpenses(data) {

    const table =
        document.getElementById("expenseTable");

    table.innerHTML = "";

    data.forEach(expense => {

        const row = `
            <tr>

                <td style="padding:10px;
                           text-align:center;">
                    ${expense.id}
                </td>

                <td style="padding:10px;
                           text-align:center;">
                    ${expense.title}
                </td>

                <td style="padding:10px;
                           text-align:center;">
                    ${expense.category}
                </td>

                <td style="padding:10px;
                           text-align:center;">
                    ₹${expense.amount}
                </td>

                <td style="padding:10px;
                           text-align:center;">
                    ${expense.expenseDate}
                </td>

                <td style="padding:10px;
                           text-align:center;">

                    <button onclick="editExpense(${expense.id})">
                        Edit
                    </button>

                    <button onclick="deleteExpense(${expense.id})">
                        Delete
                    </button>

                </td>

            </tr>
        `;

        table.innerHTML += row;

    });
}


// DASHBOARD


function updateDashboard(data) {

    document.getElementById("totalCount").innerText =
        data.length;


    const total = data.reduce(
        (sum, expense) => sum + expense.amount,
        0
    );


    document.getElementById("totalAmount").innerText =
        "₹" + total;

}



// ADD EXPENSE


function addExpense() {

    const expense = {

        title:
            document.getElementById("title").value.trim(),

        category:
            document.getElementById("category").value.trim(),

        amount:
            Number(document.getElementById("amount").value),

        expenseDate:
            document.getElementById("expenseDate").value
    };


    fetch("/api/expenses", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(expense)

    })

    .then(response => {

        if (!response.ok) {
            throw new Error("Failed to add expense");
        }

        return response.json();

    })

    .then(() => {

        alert("Expense added successfully!");

        clearForm();

        loadExpenses();

    })

    .catch(error => {

        console.error("Error adding expense:", error);

        alert("Failed to add expense");

    });
}



// CLEAR FORM

function clearForm() {

    document.getElementById("title").value = "";

    document.getElementById("category").value = "";

    document.getElementById("amount").value = "";

    document.getElementById("expenseDate").value = "";

}



// EDIT EXPENSE


function editExpense(id) {

    fetch("/api/expenses/" + id)

        .then(response => {

            if (!response.ok) {
                throw new Error("Expense not found");
            }

            return response.json();

        })

        .then(expense => {

            document.getElementById("title").value =
                expense.title;

            document.getElementById("category").value =
                expense.category;

            document.getElementById("amount").value =
                expense.amount;

            document.getElementById("expenseDate").value =
                expense.expenseDate;


            const button =
                document.getElementById("saveButton");


            button.dataset.id =
                expense.id;


            button.innerText =
                "Update Expense";


            button.onclick =
                updateExpense;


            window.scrollTo({

                top: 300,

                behavior: "smooth"

            });

        })

        .catch(error => {

            console.error("Error loading expense:", error);

            alert("Failed to load expense");

        });
}



// UPDATE EXPENSE

function updateExpense() {

    const button =
        document.getElementById("saveButton");


    const expense = {

        id:
            Number(button.dataset.id),

        title:
            document.getElementById("title").value.trim(),

        category:
            document.getElementById("category").value.trim(),

        amount:
            Number(document.getElementById("amount").value),

        expenseDate:
            document.getElementById("expenseDate").value
    };


    fetch("/api/expenses", {

        method: "PUT",

        headers: {

            "Content-Type": "application/json"

        },

        body: JSON.stringify(expense)

    })

    .then(response => {

        if (!response.ok) {
            throw new Error("Failed to update expense");
        }

        return response.json();

    })

    .then(() => {

        alert("Expense updated successfully!");

        clearForm();

        resetSaveButton();

        loadExpenses();

    })

    .catch(error => {

        console.error("Error updating expense:", error);

        alert("Failed to update expense");

    });
}



// RESET SAVE BUTTON

function resetSaveButton() {

    const button =
        document.getElementById("saveButton");


    button.innerText =
        "Add Expense";


    button.onclick =
        addExpense;


    delete button.dataset.id;

}



// DELETE EXPENSE

function deleteExpense(id) {

    const confirmDelete =
        confirm("Are you sure you want to delete this expense?");


    if (!confirmDelete) {

        return;

    }


    fetch("/api/expenses/" + id, {

        method: "DELETE"

    })

    .then(response => {

        if (!response.ok) {
            throw new Error("Failed to delete expense");
        }

    })

    .then(() => {

        alert("Expense deleted successfully!");

        loadExpenses();

    })

    .catch(error => {

        console.error("Error deleting expense:", error);

        alert("Failed to delete expense");

    });
}


// START APPLICATION

loadExpenses();