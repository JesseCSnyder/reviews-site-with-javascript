var socMedia = document.querySelectorAll('i');
for (var i=0; i<socMedia.length; i++) {
	socMedia[i].addEventListener('mouseover', function() {
		this.style.fontSize = '200%';
	})
	socMedia[i].addEventListener('mouseout', function() {
		this.style.fontSize = '100%';
	});
}

var copyRight = document.querySelector('h4');
copyRight.addEventListener('mouseover', function () {
	document.querySelector('h4').innerText = 'Made by Jesse Snyder';
})
copyRight.addEventListener('mouseout', function () {
	document.querySelector('h4').innerText = 'Lorem Ipsum Industries Inc. Copyright 2017';
})


