function backspaceCompare(s: string, t: string): boolean {
    let first: string[] = [];
    let second: string[] = [];

    for(const c of s){
        if(c !== '#'){
            first.push(c);
        }else{
            first.pop();
        }
    }

    for(const c of t){
        if(c !== '#'){
            second.push(c);
        }else{
            second.pop();
        }
    }

    return first.join("") === second.join("");

    return true;
};
