This is an test automation assignment for singtel in Singapre. As per the instruction given i have used another BDD test automation framework called Gauge. This project tests some of the functionalities of the ToDo demo app.

Pre Requisites
Java
Maven

How to Install Gauge Core
On Windows

Install Chocolatey by executing the following command.
@"%SystemRoot%\System32\WindowsPowerShell\v1.0\powershell.exe" -NoProfile -InputFormat None -ExecutionPolicy Bypass -Command "iex ((New-Object System.Net.WebClient).DownloadString(‘https://chocolatey.org/install.ps1'))" && SET "PATH=%PATH%;%ALLUSERSPROFILE%\chocolatey\bin"

Install Gauge by executing the following command.
choco install gauge

On MacOS

Update Homebrew.
brew update

Install Gauge using Homebrew.
brew install gauge

On Linux

First, add Gauge’s GPG key with this command.
sudo apt-key adv --keyserver hkp://pool.sks-keyservers.net --recv-keys 023EDB0B

Then add Gauge to the repository list using this command.
echo deb https://dl.bintray.com/gauge/gauge-deb nightly main | sudo tee -a /etc/apt/sources.list

Finally, install Gauge using these commands.
sudo apt-get update
sudo apt-get install gauge


How to Install Gauge Plugins
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

Configurations for IE 11 on Windows
Open Registry Editor (Windows Key + R → Type regedit → Press Enter).
For 32-bit Windows installations, the key you must examine in the registry editor is
HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE
For 64-bit Windows installations, the key is
HKEY_LOCAL_MACHINE\SOFTWARE\Wow6432Node\Microsoft\Internet Explorer\Main\FeatureControl\FEATURE_BFCACHE
Please note that the FEATURE_BFCACHE subkey may or may not be present, and should be created if it is not present.
Inside this key, create a DWORD value named iexplore.exe with the value of 0.
Go to Internet Options on Internet Explorer.
Go to Security tab.
Check Enable Protected Mode for all zones (Internet, Local intranet, Trusted sites and Restricted sites).
Click on Apply button.
Click on OK button.

Browser	Version
Chrome	68.0.3440.106 (Official Build) (64-bit)
Firefox	61.0.2 (64-bit)
IE	11.228.17134.0
Edge	42.17134.1.0
Tested on Windows 10 Core i7 Machine.
