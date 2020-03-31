function swapTowardCenter(arr)
{
	var temp = arr[0];
	arr[0] = arr[arr.length-1];
	arr[arr.length-1]=temp;
	if (arr.length%2==0)
	{
		var temp = arr[arr.length/2-1];
		arr[arr.length/2-1]=arr[arr.length/2];
		arr[arr.length/2]=temp;
	}
	else
	{
	
	}
	
	return arr;
}
