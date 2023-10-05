//add/change html elemnts
/*
.innerHTML [vulnerable to XSS attacks]
.textContent (more secure)
*/
const nameTag = document.createElement("h1");
nameTag.innerHTML = "9ino6ano";
//nameTag.innerHTML = window.prompt('Enter Your Name:');
document.body.append(nameTag);

const myList = document.querySelector("#fruits");
const listItem = document.createElement("li");
listItem.textContent = "Mango";
//myList.append(listItem);
//myList.prepend(listItem);
myList.insertBefore(listItem, myList.getElementsByTagName("li")[3]);
