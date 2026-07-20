function loadEmployees() {

    fetch("http://localhost:7777/user/all")

    .then(function(response) {

        return response.json();

    })

    .then(function(data) {

        const table = document.getElementById("empTable");

        table.innerHTML =

        "<tr>" +
        "<th>ID</th>" +
        "<th>Name</th>" +
        "<th>Age</th>" +
        "<th>Department</th>" +
        "<th>Role</th>" +
        "<th>Email</th>" +
        "</tr>";

        data.forEach(function(emp) {

            table.innerHTML +=

            "<tr>" +

            "<td>" + emp.id + "</td>" +

            "<td>" + emp.name + "</td>" +

            "<td>" + emp.age + "</td>" +

            "<td>" + emp.department + "</td>" +

            "<td>" + emp.role + "</td>" +

            "<td>" + emp.email + "</td>" +

            "</tr>";

        });

    });

}



function loadLeaves() {

    fetch("http://localhost:7777/leave/all")

    .then(function(response) {

        return response.json();

    })

    .then(function(data) {

        const table = document.getElementById("leaveTable");

        table.innerHTML =

        "<tr>" +
        "<th>Leave ID</th>" +
        "<th>Employee ID</th>" +
        "<th>Department</th>" +
        "<th>Start Date</th>" +
        "<th>End Date</th>" +
        "<th>Reason</th>" +
        "<th>Status</th>" +
        "</tr>";

        data.forEach(function(leave) {

            table.innerHTML +=

            "<tr>" +

            "<td>" + leave.leaveId + "</td>" +

            "<td>" + leave.empId + "</td>" +

            "<td>" + leave.department + "</td>" +

            "<td>" + leave.startDate + "</td>" +

            "<td>" + leave.endDate + "</td>" +

            "<td>" + leave.reason + "</td>" +

            "<td>" + leave.status + "</td>" +

            "</tr>";

        });

    });

}