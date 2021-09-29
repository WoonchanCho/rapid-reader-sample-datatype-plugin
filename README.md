# Sample Datatype Plugin for Rapid Reader

# Building

To build the XNAT RadReports Datatype plugin:

1. If you haven't already, clone this repository and cd to the newly cloned folder.
1. Build the plugin: `./gradlew jar` (on Windows, you can use the batch file: `gradlew.bat jar`). This should build the plugin in the file **build/libs/xnat-radread-plugin-1.0.0.jar** (the version may differ based on updates to the code).
1. Copy the plugin jar to your plugins folder: `cp build/libs/xnat-gen-read-plugin-1.0.0.jar /data/xnat/home/plugins`

# Deploying

Deploying your XNAT plugin just requires copying it to the **plugins** folder for your XNAT installation. The location of the **plugins** folder varies based on how and where you have installed your XNAT. If you are running a virtual machine created through the [XNAT Vagrant project](https://bitbucket/xnatdev/xnat-vagrant.git), you can copy the plugin to the appropriate configuration folder and then copy it within the VM from **/vagrant** to **/data/xnat/home/plugins**.

You can also set up a share for your Vagrant configuration that actually creates the VM's **plugins** folder as a share with your host machine. This allows you to deploy the plugin by copying it into the shared local folder, where it will then appear on the VM in the linked shared folder.

Once you've copied the plugin jar into your XNAT's **plugins** folder, you need to restart the Tomcat server. Your new plugin will be available and the data type will be enabled in your XNAT as soon as the restart and initialization process is completed.

# Enabling in Session Report Pages

The easiest way for users to add a new Rad Read assessor to an image session in your XNAT is if you give them a link in the Actions menu of that image session report page. To add this action, do the following for **each image session data type** you want to add this functionality to:

1. In the top navigation of your XNAT, go to `Administer > Data Types`.
1. Click on the image session xsiType link for the data type you want to modify; for example, **xnat:mrSessionData**.
1. Click "Edit" in the summary dialog that opens for that data type.

In the "Available Report Actions" table in the edit data type dialog, insert this information to configure the Actions Menu link:

1. Name: **XDATScreen_edit_rad_radReportRPT101**
1. Display Name: **Add Bone Age Assessment**
1. Popup: **never**
1. Secure Access: **edit**

(Other fields can be left blank)

Submit these edits to the image session data type edit dialog, and navigate to an image session page to verify that the link shows up. Note that with a secure access setting of "Edit", any user with edit permissions in. your project will be able to add an assessment. With secure access settings of "Delete", only users with delete permissions (aka Project Owners) will be able to add new instances of this data type.
