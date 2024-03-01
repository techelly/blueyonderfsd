import HelloMessageComponent from './HelloMessage';
//Parent
function HelloWorldComponent(){
    const name="Aditi";
    //const msg = "Message from "+name+" Hi, Hello";
    const impMsg= "I am not present in the class mentally";
    return(
        <>
        <div>Hello World Component</div>

        {/* <HelloMessageComponent msg={msg} impMsg={impMsg}/>         */}
        <HelloMessageComponent name={name} impMsg={impMsg}/>
        </>
    );
}

export default HelloWorldComponent;