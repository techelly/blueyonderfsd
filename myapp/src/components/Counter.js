import {useState} from 'react';

function Counter(){
    const [counterValue,setCounterValue]=useState(0);
    
    const handleIncrement=()=>{
        setCounterValue(counterValue+1);
    }

    const handleDecrement=()=>{
        setCounterValue(counterValue-1);
    }
    return (
        <div>

            <div>
             <button onClick={handleIncrement}>+</button>
             <button onClick={handleDecrement}>-</button>
            </div>
            <div>
                <h4>Value : {counterValue}</h4>
            </div>

        </div>
    );
}

export default Counter;