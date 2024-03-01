function HelloMessageComponent(props){
   
    const msg = "Message from "+props.name+" Hi, Hello";
    return (
        <>
        <p>{msg}</p>
        <p>{props.impMsg}</p>
        <p>hi</p>
        </>
        );
}

export default HelloMessageComponent;