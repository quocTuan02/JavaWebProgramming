const elemNames = ["name", "age", "address"];

function add() {
    $("#trNew").attr("hidden", false);
    // $(".list").attr("hidden", true);
    $("#add_new").attr("hidden", true);
}

function cancel() {
    $("#trNew").attr("hidden", true);
    location.reload();

}

function finish() {
    $.ajax({
        url: "add",
        type: "post",
        data: {
            name: document.getElementById("nameInputNew").value,
            age: document.getElementById("ageInputNew").value,
            address: document.getElementById("addressInputNew").value,
        },
        success: function (result) {
            alert("Thêm mới thành công");
            location.reload();
        },
        error: function (error) {
            alert("Loi!");
        }
    });
}


function deleteRow(id) {
    $.ajax({
        url: "delete",
        type: "post",
        data: {
            id: id
        },
        success: function (result) {
            alert("Xóa thành công");
            location.reload();
        },
        error: function (error) {
            alert("Loi!");
        }
    });
}


function enableUpdate(id) {

    elemNames.forEach(function (element) {
        const spanSelector = "#" + element + "Span" + id;
        const inpSelector = "#" + element + "Input" + id;
        $(spanSelector).attr("hidden", true);
        $(inpSelector).attr("hidden", false);

        $(inpSelector).keypress(function (event) {
            if (event.which === 13) {
                update(id);
            }
        })
    });
}

function update(id) {
    elemNames.forEach(function (element) {
        const spanSelector = "#" + element + "Span" + id;
        const inpSelector = "#" + element + "Input" + id;

        $(spanSelector).attr("hidden", false);
        $(inpSelector).attr("hidden", true);

        const oldVal = $(spanSelector).text();
        const newVal = $(inpSelector).val();

        if (oldVal !== newVal) {
            $(spanSelector).text(newVal);

            $.ajax({
                url: "update",
                type: "post",
                data: {
                    key: element,
                    id: id,
                    newValue: newVal
                },
                success: function (result) {
                    alert("Sửa thành công !");
                },
                error: function (error) {
                    alert("Lỗi");
                }
            })
        }
    })
}
