// Description:
//  test

"use strict";
const scalajs = require("../lib/scala-js-in-hubot-fastopt.js");
const hoge = scalajs.com.ru.waka.Hoge()

module.exports = (robot => {
    robot.respond(/ping/i, res => {
        res.send(hoge.ping())
    })
})
