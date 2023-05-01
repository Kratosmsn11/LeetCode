function average(salary: number[]): number {
    salary.sort((a,b) => a-b);
    console.log(salary);
    var res = 0;
    for(var i = 1; i < salary.length-1; i++) res += salary[i];

    return res/(salary.length-2);
};
