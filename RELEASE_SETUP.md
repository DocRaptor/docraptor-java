If you haven't released this package before, there are a few things you'll need to do

## Create a GPG key

`script/release` should handle this for you, but if you run into trouble
read more.

`brew install gpg2`

Use [this guide](http://central.sonatype.org/pages/working-with-pgp-signatures.html) for generating a key.

## Publish your public key to several key servers

`script/release` should handle this for you, but if you run into trouble
read more. Note you may get a verification email for keys.openpgp.org and you
may need to click the link in that email.

Get your key id `gpg2 --list-keys` (looks something like `453D1C92`)

- `gpg --keyserver keys.openpgp.org --send-keys KEY_ID`
- `gpg --keyserver keyserver.ubuntu.com --send-keys KEY_ID`
- `gpg --keyserver pgp.mit.edu --send-keys KEY_ID`

Then verify that your key is on one of those servers by looking on those servers. Search by your name. If nothing comes up, the key isn't available yet and you can't release.

- http://pgp.mit.edu/
- http://keyserver.ubuntu.com/
- https://keys.openpgp.org/

## Sign up for Sonatype jira account at https://issues.sonatype.org

`script/release` should handle this for you, but if you run into trouble
read more.

Put those Sonatype credentials in ~/.m2/settings.xml

it will look like
```
<settings>
  <servers>
    <server>
      <id>ossrh</id>
      <username>YOUR_USERNAME</username>
      <password>YOUR_PASSWORD</password>
    </server>
  </servers>
</settings>
```

## Ask for access

Get someone that already has access to open a ticket requesting access for you ([example](https://issues.sonatype.org/browse/OSSRH-21148?jql=text%20~%20%22docraptor%22)). It's a manual process so you'll have to wait.


