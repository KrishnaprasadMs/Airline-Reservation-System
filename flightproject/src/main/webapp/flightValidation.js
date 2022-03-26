function doValidate() {
    var flightName = document.flight_form.flightName;
    var flightNumber = document.flight_form.flightNumber;
    var source = document.flight_form.source;
    var destination = document.flight_form.destination;
    var travelDate = document.flight_form.travelDate;
    var departureTime = document.flight_form.departureTime;
    var arrivalTime = document.flight_form.arrivalTime;
    var flightCapacity = document.flight_form.flightCapacity;
    let dateformat = /^\d{1,2}\/\d{1,2}\/\d{4}$/;;
    var numberFormat = /^[0-9]+$/;
    if (flightName.value.length <= 0) {
        alert("Name is required");
        flightName.focus();
        return false;
    }
    if (flightNumber.value.length <= 0) {
        alert("flightNumber is required");
        flightNumber.focus();
        return false;
    }
    if (source.value.length <= 0) {
        alert("source is required");
        source.focus();
        return false;
    }
    if (destination.value.length <= 0) {
        alert("destination is required");
        destination.focus();
        return false;
    }
    if (travelDate.value.length <= 0) {
        alert("travelDate is required");
        travelDate.focus();
        return false;
    }
    if (departureTime.value.length <= 0) {
        alert("departureTime is required");
        departureTime.focus();
        return false;
    }
    if (arrivalTime.value.length <= 0) {
        alert("arrivalTime is required");
        arrivalTime.focus();
        return false;
    }
    if (flightCapacity.value.length <= 0) {
        alert("flightCapacity is required");
        flightCapacity.focus();
        return false;
    }
    if (!flightNumber.value.match(numberFormat)) {
        alert("NumberFormat is not correct ");
        flightNumber.focus();
        return false;
    }
    if (!travelDate.value.match(dateformat)) {
        alert("DateFormat is not correct ");
        travelDate.focus();
        return false;
    }
    if (!confirm("Are you sure to add the new flight?")) {
        return false;
    }
    return true;
}