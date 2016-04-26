all:
	sbt fastOptJS
	cp -rf target/scala-2.11/scala-js-in-hubot-fastopt.js ./src/lib/scala-js-in-hubot-fastopt.js
