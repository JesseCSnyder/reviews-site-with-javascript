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


////Non-functional; work in progress
//comment__button.addEventListener('click', function() {
//	var commentNbr = 0;
//	commentNbr = commentNbr + 1;
//	var newComment = document.createElement('p');
//	comment__section.appendChild('newComment');
//	var response = document.createTextNode('comment');
//	document.querySelector('p').createTextNode = document.querySelector('comment');
//	newComment.className = 'commentNbr' + commentNbr;
//	console.log(comment__button);
//});

	