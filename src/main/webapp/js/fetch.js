$(document).ready(function () {

});

function datos() {
    const url = 'https://randomuser.me/api/';
    fetch(url, {
        method: "GET",
        headers: {"Content-type": "application/json;charset=UTF-8"}
    })
            .then((resp) => resp.json())
            .then(function (data) {
                document.getElementById("respuesta").innerHTML = 
                "<img src="+JSON.stringify(data.results[0]['picture']['large'])+" alt='alt' width='200' height='200'/>";
        
            })
            .catch(function (error) {
                console.log(error);
            });
}