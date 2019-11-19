# Termux:Task

The project is forked from the original one: https://github.com/termux/termux-tasker, I will do some changes in this project with my own ideas.

A [Termux](https://termux.com) add-on app allowing Termux programs to be executed
from [Tasker](https://tasker.dinglisch.net/).

## Installation


The original Termux:Task application(not my modified one) can be obtained from:

- [Google Play](https://play.google.com/store/apps/details?id=com.termux.tasker)
- [F-Droid](https://f-droid.org/en/packages/com.termux.tasker/)
- [Kali Nethunter Store](https://store.nethunter.com/en/packages/com.termux.tasker/)

Additionally we offer development builds for those who want to try out latest
features ready to be included in future versions. Such build can be obtained
directly from [Cirrus CI artifacts](https://api.cirrus-ci.com/v1/artifact/github/termux/termux-tasker/debug-build/output/app/build/outputs/apk/debug/app-debug.apk).

Signature keys of all offered builds are different. Before you switch the
installation source, you will have to uninstall the Termux application and
all currently installed plugins.

If you want to use the version what I build, please general the apk by yourself.

## How to use

1. Create a new Tasker Action.
2. In the resulting Select Action Category dialog, select Plugin.
3. In the resulting Termux:Task dialog, select Termux:Task.
(From v0.4_hao)
4. Give the permission of write and read sotrage, it allows you to choose the folder for scripts on your internal storage of your phone.
5. Choose the folder which includes your scripts.If you don`t change it, it will be default set as `~/.termux/tasker/` and if it should be executed in the background (the default) or in a new terminal session.

## License

Released under [the GPLv3 license](https://www.gnu.org/licenses/gpl.html).
