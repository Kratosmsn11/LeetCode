function replaceWords(dictionary: string[], sentence: string): string {
    return sentence.split(' ').map(word => findRootWord(word, dictionary)).join(' ');

function findRootWord(word: string, dictionary: string[]): string{
    let res = word;

    for(const potentialRoot of dictionary){
        if(!word.startsWith(potentialRoot)){
            continue;
        }

        if(potentialRoot.length < res.length){
            res = potentialRoot;
        }
    }

    return res;
}

};
