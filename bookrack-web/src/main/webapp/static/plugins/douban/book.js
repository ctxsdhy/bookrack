/* 豆瓣图书接口 */
Namespace.register("douban.book");

(function() {
	
	//搜索图书
	this.search = function(q, count, loadSearch) {
		$.ajax({
			url: 'https://api.douban.com/v2/book/search',
			type: 'get', async: false, dataType: "jsonp",
			data: {q: q, count: count},
			success: function(data) {
				loadSearch(data);
			}
		})
	}
	
	//获取图书
	this.get = function(isbn, loadBook) {
		$.ajax({
			url: 'https://api.douban.com/v2/book/isbn/' + isbn,
			type: 'get', async: false, dataType: "jsonp",
			success: function(data) {
				loadBook(data);
			}
		})
	}
}).call(douban.book);