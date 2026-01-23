import React from 'react';

const Sidebar = ({ activeTab, setActiveTab }) => {

  return (
    <div className="w-64 bg-gray-900 text-white shadow-lg">
      <div className="p-6 border-b border-gray-700">
        <h1 className="text-2xl font-bold">SW Traders 🎉</h1>
        <p className="text-gray-400 text-sm mt-2">Hardwares to Inspire you!</p>
      </div>

      <nav className="p-4 space-y-2">
        <button
          onClick={() => setActiveTab('products')}
          className={`w-full text-left px-4 py-3 rounded-lg transition ${
            activeTab === 'products'
              ? 'bg-blue-600 text-white'
              : 'text-gray-300 hover:bg-gray-800'
          }`}
        >
          📦 Products
        </button>

        <button
          onClick={() => setActiveTab('orders')}
          className={`w-full text-left px-4 py-3 rounded-lg transition ${
            activeTab === 'orders'
              ? 'bg-blue-600 text-white'
              : 'text-gray-300 hover:bg-gray-800'
          }`}
        >
          📋 Orders
        </button>
      </nav>
    </div>
  );
};

export default Sidebar;
