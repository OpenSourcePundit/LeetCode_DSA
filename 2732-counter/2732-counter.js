/**
 * @param {number} n
 * @return {Function} counter
 */
 var first = true;
 var n = 10
var createCounter = function(n) {
 
    return function() {
        return n++
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */