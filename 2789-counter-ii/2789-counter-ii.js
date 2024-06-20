/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let storeval = init
    return{
        increment:()=>{
            
            return ++storeval
        },
        decrement:()=>{
            
            return --storeval 
        },
        reset:()=>{
            storeval=init
            return(storeval)
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */