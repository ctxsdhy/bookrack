/* 表单工具 */
Namespace.register("form.tool");

(function() {
	
	//表格加载勾选框
	this.tbLoadSelect = function(table, hasSelectAll) {
		table.find('thead th:eq(0)').css('width', '39px');
		if(hasSelectAll) {
			table.find('thead th:eq(0)').append('<div class="ui fitted checkbox"><input type="checkbox" id="selectAll"><label></label></div>');
			table.find('#selectAll').on('click', function() {
				table.find('tbody :checkbox').prop('checked', $(this).prop('checked'));
			});
		}
		table.find('tbody tr').each(function(i) {
			var itemId = $(this).find('td:eq(0)').attr('itemId');
			$(this).find('td:eq(0)').append('<div class="ui fitted checkbox"><input type="checkbox" id="select' + i + '" value=' + itemId + '><label></label></div>');
		});
	}
	
	//表格获得选中个数
	this.tbGetSelectedCount = function(table) {
		return table.find('tbody :checked').length;
	}
	
	//表格获得选中值
	this.tbGetSelectedValue = function(table) {
		return table.find('tbody :checked').map(function() {return $(this).val()}).get().join(',');
	}
}).call(form.tool);