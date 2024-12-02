document.getElementById('myForm').addEventListener('submit', function(event) {
    event.preventDefault();  
    
    
    const first = document.getElementById('Fname').value;
    const last = document.getElementById('Lname').value;
    const age = parseInt(document.getElementById('age').value);
    const phone = document.getElementById('phone').value;
    const seat = document.getElementById('seating').value;
    const date = document.querySelector('input[name="date"]:checked')?.value;
    const terms = document.querySelector('input[name="terms"]').checked;
  
    
    if (!first || !last || !age || !phone || !seat || !date || !terms) {
        alert("Please fill in all required fields.");
        return;
    }
  
    if (age < 18) {
        alert("You must be 18 or older.");
        return;
    }
  
    const formData = {
        Fname: first,
        Lname: last,
        age: age,
        phone: phone,
        seating: seat,
        date: date,
        comments: document.getElementById('comments').value
    };
  
    console.log(formData);
  
    const xhr = new XMLHttpRequest();
    xhr.open("GET", "submit.json", true);  
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
  
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            const response = JSON.parse(xhr.responseText);
            document.getElementById('message').innerHTML = response.message;
            document.getElementById('myForm').reset();  
            document.getElementById('myForm').querySelectorAll('input, select, textarea').forEach(el => el.disabled = true);
        } else if (xhr.readyState === 4) {
            alert('Error submitting form');
        }
    };
  
    xhr.send(JSON.stringify(formData));
  });