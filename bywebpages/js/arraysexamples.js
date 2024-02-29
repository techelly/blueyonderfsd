var arr =["HTML","CSS","Bootstrap","Java Script","Bootstrap"];

function display(y,x){
    console.log("index value = "+x+" item value = "+y);
}
//forEach
arr.forEach(display);

//find()
function searchTechnology(tech){
    return tech=="Bootstrap";
}
console.log("***********************************************");
//console.log(arr.find("CSS"));
console.log("***********************************************");
console.log(arr.find(searchTechnology));
console.log("***********************************************");
var searchTech =arr.find(searchTechnology);
console.log(searchTech);

//filter()
function checkTechs(tech){
    return tech!="Bootstrap";
}
console.log(arr.filter(checkTechs));


//map

function changetoUpperCase(tech){
    return tech.toUpperCase();
}

console.log(arr.map(changetoUpperCase));
var chUpprCase =arr.map(changetoUpperCase);
console.log(chUpprCase); 