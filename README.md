This is an test automation assignment for singtel in Singapre. As per the instruction given i have used another BDD test automation framework called Gauge. This project tests some of the functionalities of the ToDo demo app.

**Pre Requisites**
------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. Java
2. Maven

**How to Install Gauge Core**
------------------------------------------------------------------------------------------------------------------------------------------------------------------
1. On Windows

1. Install Chocolatey by executing the following command.
@"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString(‘https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"

2. Install Gauge by executing the following command.
choco install gauge

**On MacOS**

1. Update Homebrew.
	brew update

2. Install Gauge using Homebrew.
	brew install gauge

**On Linux**

1. First, add Gauge’s GPG key with this command.
	sudo apt-key adv --keyserver hkp://pool.sks-keyservers.net --recv-keys 023EDB0B

2. Then add Gauge to the repository list using this command.
	echo deb https://dl.bintray.com/gauge/gauge-deb nightly main | sudo tee -a /etc/apt/sources.list

3. Finally, install Gauge using these commands.
	sudo apt-get update
	sudo apt-get install gauge


**How to Install Gauge Plugins**

Open Command Prompt and execute following commands.
gauge install java
gauge install html-report
gauge install json-report
gauge install xml-report
gauge install spectacle
gauge install flash

You can check the installation using the following command.
gauge -v

If the installation is success, it will output like this:

    Gauge version: <version number>
    Plugins
    -------
    flash (<version number>)
    html-report (<version number>)
    java (<version number>)
    json-report (<version number>)
    spectacle (<version number>)
    xml-report (<version number>)

**Browser	Version**
	Chrome	68.0.3440.106 or latest (Official Build) (64-bit)
	Tested on Windows 10 Core i7 Machine.
