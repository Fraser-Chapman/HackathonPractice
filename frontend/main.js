console.log('Working!');

const xhr = new XMLHttpRequest();
xhr.open('GET', 'http://127.0.0.1:8080/api/carpark', true);
xhr.send();

xhr.addEventListener("readystatechange", processRequest, false);


function processRequest(e) {
    if (xhr.readyState === 4 && xhr.status === 200) {
        var response = JSON.parse(xhr.response);
        alert(response.location);

    }
}