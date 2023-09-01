// solution from the session
function isValid(s: string): boolean {
    const stack = [];

    for(const c of s){
        if("([{".includes(c)){
            stack.push(c);
            continue;
        }
        const last = stack.pop();
        if(last === '[' && c === ']'){
            continue;
        }
        if(last === '(' && c === ')'){
            continue;
        }
        if(last === '{' && c === '}'){
            continue;
        }

        return false;
    }

    return stack.length === 0;
};
