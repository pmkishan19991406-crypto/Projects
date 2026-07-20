function loginUser() {

    const user = {

        username: document.getElementById("username").value,

        password: document.getElementById("password").value

    };

    fetch("http://localhost:7777/user/login", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(user)

    })

    .then(function(response) {

        return response.json();

    })

    .then(function(data) {

        if (data == null) {

            alert("Invalid Username or Password");

            return;
        }

        // Store logged-in user details
        localStorage.setItem("userId", data.id);
        localStorage.setItem("username", data.username);
        localStorage.setItem("role", data.role);

        if (data.role == "EMPLOYEE") {

            window.location.href = "employee.html";

        }
        else if (data.role == "MANAGER") {

            window.location.href = "manager.html";

        }
        else if (data.role == "CEO") {

            window.location.href = "ceo.html";

        }

    })

    .catch(function(error) {

        console.log(error);

        alert("Server Error");

    });

}