#ANDROID DRUMS APPLICATION (For witnessing Android's 10ms problem)


Description: Interactive music applications which require audio latency of <10ms have been always succesful on iOS platform. Android however is unable to cope up with this requirement as android audio library is device dependent. Audio app working fine on say one plus and nexus devices can show unacceptable latency on samsung phones creating lots of issues for developers. To actually see this latency in action, a proof of concept was developed which uses triggering of drum kit sounds. Being a drummer, simple drum kit patterns were played on the app. It was noticed that the performance varried from device to device. Audio latency on android Kitkat was huge which rendered
the application useless. While latency on phone running lollipop was not the best but could be good enough to play without destroying the musical sense of drums pattern. Solution to tackle android’s 10ms problem is that avoid using java for audio processing. Instead of using java, c++ is used using Android’s NDK. However problem still presisted on some android devices which the case while developing apps on iOS platform. 


Technology: Android SDK, SoundPool class


Worklink: https://www.youtube.com/watch?v=FYlD7HQnI-s



![drums_youtube_video_link](https://cloud.githubusercontent.com/assets/14818804/21539486/48c1979e-cdcd-11e6-8e9f-e5d2bd4cda0f.png)


Youtube Video Link Below : https://www.youtube.com/watch?v=FYlD7HQnI-s
