//注册名字空间
Namespace = new Object();
Namespace.register = function(NS) {
	var nArr = NS.split("."), sEval = "", sNS = "", i = 0, nLen = nArr.length;
	for (; i < nLen; i++) {
		if (i != 0) sNS += ".";
		sNS += nArr[i];
		sEval += "if(typeof(" + sNS + ")=='undefined') " + sNS + " = new Object();";
	}
	if (sEval != "") eval(sEval);
}
