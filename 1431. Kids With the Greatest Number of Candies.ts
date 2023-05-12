function kidsWithCandies(candies: number[], extraCandies: number): boolean[] {
    let max = 0;
    for(let i=0; i<candies.length; i++) if(candies[i] > max) max = candies[i];

    let res = Array(candies.length).fill(false);

    for(let i = 0; i<candies.length; i++){
            if((candies[i]+extraCandies) >= max) res[i] =true;
    } 
    
    return res;
};
