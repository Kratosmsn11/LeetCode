function balancedStringSplit(s: string): number {
    const chars = [...s];
    let balance : number = 0, res : number = 0;

    for(const char of chars){
        balance += char == 'L' ? 1 : -1;
        res += balance === 0 ? 1 : 0;
    }

    return res;
};
