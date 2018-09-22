Bro is a lightweight Android modularity solution

## problems&scenarios
- The processes that you jump among Native,H5,RN,Weex are complicated and don't have a uniform logic
(for example,some pages need login status while other don't)
- You want to display different UI and function to different user groups,but you must add if/else in all relevant places
- The module you are maintaining must let out some interfaces to let other modules call. And all of you don't want to be
dependent on each other directly but don't have global bidirectional communication channels.You may hav a lot of BroadcastReceiver and EventBus everywhere.
- Althogh you are maintaining a small App ( Probably no more than ten people),but team members should develop your own modules as independently as possible
even package and run you own applications independently without being influenced by others.(such as commenting out your code module )
- ...

All of these problems are what I have met and what Bro try to solve.If you have knew [《Return to the beginner's mind, from containerization to componentization》](https://github.com/MDCC2016/Android-Session-Slides/blob/master/02-From.Containerization.To.Modularity.pdf)
 shared by Oasis Feng in the end of 2016,you may have a good understanding of concept of modularization and componentization.
 It's important to emphasize one thing,** Bro's goal is not a routing framework, but a modular framework aimed at component decoupling and efficient development. **
 (But Bro isn't like most componentized framework which have the option for each component to start independently Debug. The module are still on top of the main project's container and then decouple the packaging of modules through local hot deployment.)

 ## Characteristic

 - Provide the startup callbacks required for the modules.

 - Support inter-module basic routing ,realizing the Uri regulations which stipulating the easy interchange and global unification of containers Native Acitivity, WebPage ,Weex and RN.

 - Provide the interface exposure service and interface acquisition service between modules,and by it realize the acquisition or start of cross-module Fragment and Service.

 - Custom properties support of pages and service.

 - Providing global interceptors and monitors to intercept all the processes above-mentioned and acquire the custom properties of pages and service in interceptors conveniently.

 - Automatically generate the page routing code and documentations as well as the service code and  documentations,including all kinds of custom properties.

 - The modules output in normal arr format,intergraded into the host pack.At the same time,provide module output in the form of apk for local hot deployment.(only recommended for local debug)

 - For more custom space please refer to the best practices section of subsequent documentation.
