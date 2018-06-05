-  やること
    - Activityのレイアウトとして、 ```ListView``` を使用し、データ(String配列)を表示する。
- 必要なもの(3つ)
    - Layout
        1. activity_list_view.xml
            - Activityのレイアウト
            - listviewレイアウト
            - containerなので中身空っぽ
        2. simple_list_item_1.xml（Sdkで用意されている）
            - 各itemを入れるtextview
            - 動的に追加される
    - Activity
        1. ListViewActivity.java
- 実装の流れ
    1. containerとなるActivityのLayoutを用意する。
        - activity_list_view.xml
    2. ActivityのonCreateメソッド内で...
        1. Adapterを作成する
        ```java
        ArrayAdapter<String> adapter =
        new ArrayAdapter<>(ListViewActivity.this, android.R.layout.simple_list_item_1, arr);
        ```
        2. ListViewインスタンスにAdapter をセットする
        ```java
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        ```
        3. ListViewインスタンスEventListernerをセットする
- その他
    - ListViewはAdapterViewのサブクラス
    - Adapterを使って、レイアウトとデータをバインドできる
    - AdapterはmodelとAdapterView(ListView)の仲介
       1.  ArrayAdapter
       2.  SimpleCursorAdapter(CursorAdapter)
    - ListViewはHolderモデルの使用は必須ではない。使用すべきだが
