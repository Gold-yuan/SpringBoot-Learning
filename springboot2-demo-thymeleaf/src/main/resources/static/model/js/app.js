$(function() {
	$(".navbar-expand-toggle").click(function() {
		$(".app-container").toggleClass("expanded");
		return $(".navbar-expand-toggle").toggleClass("fa-rotate-90");
	});
	return $(".navbar-right-expand-toggle").click(function() {
		$(".navbar-right").toggleClass("expanded");
		return $(".navbar-right-expand-toggle").toggleClass("fa-rotate-90");
	});
	
});
var topnav = $("#topnav").empty();
$(function(){
	// 获取菜单a-menu的地址，和浏览器当前地址比较，如果一样，则当前菜单和父菜单高亮显示
    var requestUri = window.location.pathname;
    $(".a-menu").each(function(i){
    	var menuHref = $(this).attr("href");
    	if(requestUri.indexOf(menuHref)!=-1){
    		// 高亮
    		$(this).parent().addClass("active");
    		// 父菜单展开
    		$(this).parents("div.panel-collapse").addClass("in");
    		// 父菜单高亮
    		$(this).parents("li.dropdown").addClass("active");
    		
    		var subli =  $('<li></li>');
    		subli.append($('<a href="'+menuHref+'">'+$(this).html()+'</a>'));
    		topnav.append(subli);
    	}
    });
})

//$(function() {
//	return $('select').select2();
//});

//$(function() {
//	return $('.toggle-checkbox').bootstrapSwitch({
//		size : "small"
//	});
//});

//$(function() {
//	return $('.match-height').matchHeight();
//});

$(function() {
	return $('.datatable').DataTable({
		"dom" : '<"top"fl<"clear">>rt<"bottom"ip<"clear">>'
	});
});

$(function() {
	return $(".side-menu .nav .dropdown").on('show.bs.collapse', function() {
		return $(".side-menu .nav .dropdown .collapse").collapse('hide');
	});
});
