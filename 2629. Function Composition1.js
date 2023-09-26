/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function(functions) {
	return function(x) {
        const functionsLength = functions.length;
        if(functionsLength === 0){
            return x;
        }

        let input = x;
        for(let i = functionsLength - 1; i >= 0; --i){
            const currFunc = functions[i];
            input = currFunc(input);
        }

        return input;
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */
