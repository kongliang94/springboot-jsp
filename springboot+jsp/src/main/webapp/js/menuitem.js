var menuitem = {
	setting:{
		isSimpleData: true,
		treeNodeKey: "mid",
		treeNodeParentKey: "pid",
		showLine: true,
		root:{ 
			isRoot:true,
			nodes:[]
		},
		callback:{
			 beforeClick: getCurrentNode,
		        onClick : zTreeOnClick

			}
	},
	/**
	 * 加载树
	 */
	loadMenuitemTree:function(){
		$.post("menu1",null,function(data){
			$("#tree").zTree(menuitem.setting,data);
		});
	}
};
function getCurrentNode(treeId, treeNode) {
    curNode = treeNode;
    zTreeOnClick(curNode);
}

function zTreeOnClick(treeNode){
	//alert(treeNode.mid);
	$("#testIframe", window.parent.document).attr("src", "userlist?depId="+treeNode.mid);
}

$().ready(function(){
	menuitem.loadMenuitemTree();
});
