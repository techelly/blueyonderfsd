function myFunction(){
    let element = document.querySelector('p');
    element.style.color="blue";
    element.style.backgroundColor="green";
    element.setAttribute("title","My Title");
    element.innerHTML="Changed Value";
    console.log(element);
    console.log(document.getElementsByTagName('p'));
}