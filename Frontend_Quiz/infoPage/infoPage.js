const calStudyTimeButton = document.querySelector('.calStudyTimeButton');
const result = document.querySelector('.result');

calStudyTimeButton.addEventListener('click', calculation);
function calculation() {
    const jobText = document.querySelector('.job-text').value;
    const jobTime = document.querySelector('.job-time').value;
    const trainingTime = Math.ceil(10000 / jobTime);
    if (!jobText || !jobTime){
        alert("값을 입력해주세요");
        return;
    }
    if (jobTime > 24) {
        alert("24시간 이하로 입력해주세요");
        return;
    }
    const resultMessage = `<p>당신은 <strong>${jobText}</strong>전문가가 되기 위해서</p> <p>대략 <strong>${trainingTime}</strong>일 이상 훈련하셔야 합니다!:)</p>`;
    result.innerHTML = resultMessage;
}

const goTotraining=document.querySelector('.trainingButton');
const share=document.querySelector('.shareButton');
goTotraining.addEventListener('click',()=>{
    document.querySelector('.modal').style.display='flex';
})
const modalTrainingButton=document.querySelector('.modalTrainingButton');
modalTrainingButton.addEventListener('click',()=>{
    location.href="https://www.naver.com/";
})