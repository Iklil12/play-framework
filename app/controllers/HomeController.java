package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;
import java.util.List;

public class HomeController extends Controller {

    // Halaman utama
    public Result index() {
        return ok(main.render("Beranda", index.render()));
    }

    // public Result tugas1() {
    //     return ok(main.render("Tugas 1", views.html.manajemen_tugas.matkul.PSBF.IF1B.tugas1.render()));
    // }
    public Result tugas1if1bpsbf() {
        return ok(main.render("Tugas 1", views.html.manajemen_tugas.matkul.PSBF.IF1B.tugas1if1bpsbf.render()));
        }
    public Result tugas2if1bpsbf() {
        return ok(main.render("Tugas 2", views.html.manajemen_tugas.matkul.PSBF.IF1B.tugas2if1bpsbf.render()));
    }

    public Result tugas3if1bpsbf() {
        return ok(main.render("Tugas 3", views.html.manajemen_tugas.matkul.PSBF.IF1B.tugas3if1bpsbf.render()));
    }

    public Result tugas4if1bpsbf() {
        return ok(main.render("Tugas 4", views.html.manajemen_tugas.matkul.PSBF.IF1B.tugas4if1bpsbf.render()));
    }
    public Result tugas1if1apsbf() {
        return ok(main.render("Tugas 1", views.html.manajemen_tugas.matkul.PSBF.IF1A.tugas1if1apsbf.render()));
    }
    public Result tugas2if1apsbf() {
        return ok(main.render("Tugas 2", views.html.manajemen_tugas.matkul.PSBF.IF1A.tugas2if1apsbf.render()));
    }
    public Result tugas3if1apsbf() {
        return ok(main.render("Tugas 3", views.html.manajemen_tugas.matkul.PSBF.IF1A.tugas3if1apsbf.render()));
    }
    public Result tugas4if1apsbf() {
        return ok(main.render("Tugas 4", views.html.manajemen_tugas.matkul.PSBF.IF1A.tugas4if1apsbf.render()));
    }

    public Result manajemenTugas() {
        return ok(main.render("Manajemen Tugas", views.html.manajemen_tugas.index.render()));
    }

    public Result psbf() {
        return ok(main.render("PSBF", views.html.manajemen_tugas.matkul.PSBF.index.render()));
    }
    public Result IF1A() {
        return ok(main.render("IF1B", views.html.manajemen_tugas.matkul.PSBF.IF1A.index.render()));
    }

    public Result IF1B() {
        return ok(main.render("IF1B", views.html.manajemen_tugas.matkul.PSBF.IF1B.index.render()));
    }
}
