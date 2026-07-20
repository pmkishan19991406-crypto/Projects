function loadPendingLeaves() {

    fetch("http://localhost:7777/manager/pending")

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
        "<th>Approve</th>" +
        "<th>Reject</th>" +
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

            "<td><button onclick='approveLeave(" + leave.leaveId + ")'>Approve</button></td>" +

            "<td><button onclick='rejectLeave(" + leave.leaveId + ")'>Reject</button></td>" +

            "</tr>";

        });

    })

    .catch(function(error) {

        console.log(error);

        alert("Unable to Load Pending Leaves");

    });

}



function approveLeave(leaveId) {

    fetch("http://localhost:7777/manager/approve/" + leaveId, {

        method: "PUT"

    })

    .then(function(response) {

        if (response.ok) {

            alert("Leave Approved Successfully");

            loadPendingLeaves();

        } else {

            alert("Approval Failed");

        }

    })

    .catch(function(error) {

        console.log(error);

    });

}



function rejectLeave(leaveId) {

    fetch("http://localhost:7777/manager/reject/" + leaveId, {

        method: "PUT"

    })

    .then(function(response) {

        if (response.ok) {

            alert("Leave Rejected Successfully");

            loadPendingLeaves();

        } else {

            alert("Rejection Failed");

        }

    })

    .catch(function(error) {

        console.log(error);

    });

}