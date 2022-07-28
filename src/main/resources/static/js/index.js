
function mytime() {
    var time = new Date();
    $("#login-time").html("时间："+time.toLocaleDateString()+"&nbsp"+time.toLocaleTimeString());
}

  var musArgs=[

  ];
  var musTextArgs=[
    "Uru - フリージア","EastNewSound - Urahara ff"
  ];

  $(function(){
	  if($("#login-time")[0]){
	    mytime();
	    setInterval(function() {mytime()},1000);
	  }
	  if($("#content-iframe")[0]){
	  auplBtnCtrl();
	  turnAudioText(5000);
	  // dragAp();
	  setIframeHeight();
	  }
	setFormImg();
	})


 function auplBtnCtrl(){
    var audioPlayer=document.querySelector(".audio-player");
    var audioPlayerSrc=document.querySelector(".audio-player source");
    var apText=document.querySelector(".audio-control__text");
    var apPop=document.querySelector(".audio-control__playOrPause");
    var apBackward=document.querySelector(".audio-control__step-backward");
    var apForward=document.querySelector(".audio-control__step-forward");
    var musNum=0;

    if(apPop){
      apPop.childNodes[0].className="fa fa-pause";

    apPop.addEventListener("click",function(){
      if(audioPlayer.paused){
        apPop.childNodes[0].className="fa fa-pause";
        audioPlayer.play();
      }
      else {
        apPop.childNodes[0].className="fa fa-play";
        audioPlayer.pause();
      }
    });

    apBackward.addEventListener("click",function(){
      if(musNum==0)  musNum=musArgs.length-1;
      else musNum-=1;
      audioPlayerSrc.src="./src/music/"+musArgs[musNum];
      if(!audioPlayer.paused){
         audioPlayer.load();
         apPop.childNodes[0].className="fa fa-pause";
      }
      else{
        audioPlayer.load();
        audioPlayer.pause();
        apPop.childNodes[0].className="fa fa-play";
      }
      apText.innerHTML=musTextArgs[musNum];
    });

    apForward.addEventListener("click",function(){
      if(musNum==musArgs.length-1) musNum=0;
      else musNum+=1;
      audioPlayerSrc.src="./src/music/"+musArgs[musNum];
      if(!audioPlayer.paused){
         audioPlayer.load();
         apPop.childNodes[0].className="fa fa-pause";
       }
      else {
        audioPlayer.load();
        audioPlayer.pause();
        apPop.childNodes[0].className="fa fa-play";
      }
      apText.innerHTML=musTextArgs[musNum];
   });
    }
  }

  function turnAudioText(){
    var apText=document.querySelector(".audio-control__text");
    var apTextWidth=apText.getBoundingClientRect().width;
    var moveOffset=apTextWidth-60;

    apText.style.transition="transform "+(moveOffset*12*0.001)+"s linear";
    setInterval(function(){
      apText.style.transform="translateX(-"+moveOffset+"px)";
        setTimeout(function(){
          apText.style.transform="translateX(10px)";
        },moveOffset*12);
    },moveOffset*24)
  }

  function setFormImg(){
    if($("form")[0]){
      $("body").append('<div class="form-left-img"></div><div class="form-right-img"></div>');
    }
  }
  function setIframeHeight() {
	  var obj=$("#content-iframe")[0];
	  if(obj){
		  var $height=$(obj.contentDocument).height();
	  }
	  $("#content-iframe").height($height);
  }
  // function dragAp(){
  //   var audioCtrl=document.querySelector(".audio-control");
  //   var x,y;

  //   audioCtrl.addEventListener("dragstart",function(e){
  //     e.dataTransfer.effectAllowed="move";
  //     e.dataTransfer.setData("text","");
  //     x=e.offsetX||e.layerX;
  //     y=e.offsetY||e.layerY;
  //     return true;
  //   });

  //   document.addEventListener("dragover",function(e){
  //      e.preventDefault()||e.stopPropagation();
  //   });

  //   document.addEventListener("drop",function(e){
  //     audioCtrl.style.left=(e.pageX-x)+"px";
  //     audioCtrl.style.top=(e.pageY-y)+"px";
  //     e.preventDefault()||e.stopPropagation();
  //   });
  // }
