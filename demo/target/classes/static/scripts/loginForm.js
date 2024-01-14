
function validate() {

    var username = document.getElementById("inputEmail3").value;
    var password = document.getElementById("inputPassword3").value;

    if (username == "SampleUser@email.com" && password == "SampleUser") {
        return true
    }
    else {
        alert("Incorrect username or password.")
        return false;
    }
    
}