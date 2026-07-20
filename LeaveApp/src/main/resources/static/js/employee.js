function applyLeave() {

    const leave = {

        empId: localStorage.getItem("userId"),

        department: document.getElementById("department").value,

        startDate: document.getElementById("startDate").value,

        endDate: document.getElementById("endDate").value,

        reason: document.getElementById("reason").value

    };

    fetch("http://localhost:7777/leave/apply", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(leave)

    })

    .then(function(response) {

        if (response.ok) {

            alert("Leave Applied Successfully");

            viewMyLeaves();

        } else {

            alert("Failed to Apply Leave");

        }

    });

}



function viewMyLeaves() {

    const empId = localStorage.getItem("userId");

    fetch("http://localhost:7777/leave/view/" + empId)

    .then(function(response) {

        return response.json();

    })

    .then(function(data) {

        const table = document.getElementById("leaveTable");

        table.innerHTML =

        "<tr>" +
        "<th>Leave ID</th>" +
        "<th>Start Date</th>" +
        "<th>End Date</th>" +
        "<th>Reason</th>" +
        "<th>Status</th>" +
        "<th>Action</th>" +
        "</tr>";

        data.forEach(function(leave) {

            table.innerHTML +=

            "<tr>" +

            "<td>" + leave.leaveId + "</td>" +

            "<td>" + leave.startDate + "</td>" +

            "<td>" + leave.endDate + "</td>" +

            "<td>" + leave.reason + "</td>" +

            "<td>" + leave.status + "</td>" +

            "<td><button onclick='cancelLeave(" + leave.leaveId + ")'>Cancel</button></td>" +

            "</tr>";

        });

    });

}



function cancelLeave(id) {

    fetch("http://localhost:7777/leave/cancel/" + id, {

        method: "DELETE"

    })

    .then(function(response) {

        if (response.ok) {

            alert("Leave Cancelled");

            viewMyLeaves();

        } else {

            alert("Unable to Cancel Leave");

        }

    });

}