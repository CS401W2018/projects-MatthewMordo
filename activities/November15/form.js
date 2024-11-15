document.getElementById('myForm').addEventListener('submit', function(event) {
    event.preventDefault();
    const first = document.getElementById('Fname').value;
    const last = document.getElementById('Lname').value;
    const age = parseInt(document.getElementById('age').value);
    const num = document.getElementById('phone').value;
    const seat = document.getElementById('seating').value;
    const date = document.getElementById('day').value;
    
    if (!first || !last) {
        alert("You need a first and last name.");
        return;
    }
    
    if (!age || age < 18) {  
        alert("You must be 18 or older.");
        return;
    }
    
    const formData = {
        Fname: first,
        Lname: last,
        age: age
    };

    const xhr = new XMLHttpRequest();
    xhr.open("POST", "submit.json", true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    xhr.onreadystatechange = function (){
      if (xhr.readyState === 4 && xhr.status === 200){
        const response = JSON.parse(xhr.response);
        document.getElementById('message').innerHTML = response.message;
        document.getElementById('myForm').innerHTML = "";
      } else if (xhr.readyState === 4){
        alert('Error submitting form');
      }
    };
    xhr.send(JSON.stringify(formData));
    console.log(formData);
});