function mostWordsFound(sentences: string[]): number {
    let res: number = 0;
    sentences.forEach(function (str){
        let max = 1;
        Array.from(str).forEach(function (char){
           if(char === ' '){
               max++;
           } 
        })
        res = Math.max(res, max);
    })
    
    return res;
};
