<%--
  Created by IntelliJ IDEA.
  User: Nguyen Quoc Tuan
  Date: 12/10/2019
  Time: 8:50 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">

    <style>
        span {
            cursor: pointer;
            color: white;
            background: black;
        }
    </style>
    <span id="over1" onmouseover="over1('red')" onmouseout="out1('black')" onclick="start()">
Start</span>
    <span id="over2" onmouseover="over2('red')" onmouseout="out2('black')" onclick="stop()">
Stop</span>
    <span id="over3" onmouseover="over3('red')" onmouseout="out3('black')" onclick="reset()">
Reset</span>
    <form>
        <input type="text" name="display" size="22" value="00:00:00">
    </form>
    <script type="text/javascript">
        // John Livingston (wavwizard_wavmaster@yahoo.com) | http://wavsyntax.bravehost.com

        var msec = 0
        var sec = 0
        var min = 0

        function start() {
            document.forms[0].display.value = min + ":" + sec + ":" + msec
            go = setTimeout("start()", 1)
            msec++
            if (msec == 100) {
                msec = 0
                sec++
            }
            if (sec == 60) {
                sec = 0
                min++
            }
        }

        function stop() {
            clearTimeout(go)
        }

        function reset() {
            window.location.reload()
        }

        function over1(test) {
            document.getElementById('over1').style.background = test
        }

        function out1(test) {
            document.getElementById('over1').style.background = test
        }

        function over2(test) {
            document.getElementById('over2').style.background = test
        }

        function out2(test) {
            document.getElementById('over2').style.background = test
        }

        function over3(test) {
            document.getElementById('over3').style.background = test
        }

        function out3(test) {
            document.getElementById('over3').style.background = test
        }
    </script>
</div>

<br/>
<br/>
<br/>
<div style="text-align: center">
    <div id="demo"></div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        alert("hahahlalalalal");
        // $("over1").click(function () {
        alert("hahah");
        // while (true) {
        $.ajax({
                url: "",
                type: "get",
                data: {
                    // u: 100009793995453,
                    // n: 833456
                },

                success: function (result) {
                    $("#demo").html(result);
                },
                error: function (error) {
                    alert("Loi!");
                }
            }
        );
        if (document.getElementsByName("password_new").length === 1) {
            $("over2").click();
            // break;
        }
        // }

        // })
    })
</script>
</body>
</html>
