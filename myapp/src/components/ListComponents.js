
function ListComponents(props){
    //const numbers =[1,12,3,14,5,6];
    
    
    const listNumbers=props.numbers.map(
        (number)=><li key={number}>{number}</li>
    
    );
    console.log(listNumbers);
    return <ul>{listNumbers}</ul>;
}

export default ListComponents;