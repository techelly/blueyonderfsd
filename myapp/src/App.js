import HelloWorldComponent from './components/HelloWorld';
import HelloMsg from './components/HelloMsg';
import Counter from './components/Counter';
import ListComponents from './components/ListComponents';
import CustomerComponent from './components/Customers';
function  App() {
    const numbers =[1,12,3,14,5,6];
    return (
        <>
            <h1>Use Case 1 - Components, Props and States </h1>
            <HelloWorldComponent />
            <HelloMsg msg="Constructor ka use kya hai " name="Abhilash"/>
            <Counter />
            <ListComponents numbers={numbers}/>
            <CustomerComponent />
        </>
    );
}
function App1(){

    return <h1> App1 Component</h1>;
}


function App2(){

    return <h1> App2 Component</h1>;
}
export default App;
//export default App1;//Parsing error: Only one default export allowed per module. (16:0)
//export {App1};//This will work
//export {App1,App2};//Parsing error: `App1` has already been exported. Exported identifiers must be unique. (23:8)
export {App1,App2};