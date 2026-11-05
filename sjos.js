// function getTodo() {
//     let title = document.querySelector("#title")
//     let description = document.querySelector("#description")
//     let date = document.querySelector("#date");
//     console.log(title.value, description.value, date.value);
//     let newTodo =  
//  }

// function showTodo() {
//     let box = document.querySelector(".box");
//     box.innerHTML= todos.map((val, index) => {
//         return `
//         <div class="card">
//         <p>title: ${val.title}</p>
//         <p>description: ${val.description}</p>
//         <p>date: ${val.date}</p>
//         <button onclick="deleteTodo(${index})">Delete</button>
//         </div>
//         `
//     })join("");


function getTodo() {
    event.preventDefault();
    let title = document.querySelector("#title");
    let description = document.querySelector("#description").
value
let date = document.querySelector("#date").value;
let newTodo = {title,description,date};
todos.push(newTodo);
showTodo();

}

function showTodo() {
    let box = document.querySelector(".box");
    box.innerHTML = ""
    todos.map((val, index) => {
        box.innerHTML += `
        <div class="card">
        <p>title: ${val.title}</p>
        <p>description: ${val.description}</p>
        <p>date: ${val.date}</p>
        <button onclick="deleteTodo(${index})">Delete</button>
        </div>
        `
    }