function getAverage(marks) {
	return parseInt(marks.reduce((a, b) => a + b, 0) / marks.length);
}

// eslint-disable-next-line no-console
console.log(getAverage([ 12, 11, 23, 14 ]));
