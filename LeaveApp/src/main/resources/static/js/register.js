function registerUser() {

    
    const user = {

        name: document.getElementById("name").value,
        age: document.getElementById("age").value,
        address: document.getElementById("address").value,
        email: document.getElementById("email").value,
        department: document.getElementById("department").value,
        username: document.getElementById("username").value,
        password: document.getElementById("password").value

    };


    fetch("http://localhost:7777/user/register", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(user)

    })

    .then(function(response) {

        if (response.ok) {

            alert("Registration Successful");

            document.getElementById("registerForm").reset();

            window.location.href = "login.html";

        } else {

            alert("Registration Failed");

        }

    })

    .catch(function(error) {

        console.log(error);

        alert("Server Error");

    });

}